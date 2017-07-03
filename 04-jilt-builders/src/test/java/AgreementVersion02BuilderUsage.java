import com.endoflineblog.type_safe_builder.submodule_02.AgreementVersion;
import com.endoflineblog.type_safe_builder.submodule_02.AgreementVersionBuilder;
import com.endoflineblog.type_safe_builder.submodule_02.av.AgreementVersionStatus;
import com.endoflineblog.type_safe_builder.submodule_02.av.Customer;
import com.endoflineblog.type_safe_builder.submodule_02.av.Supplier;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class AgreementVersion02BuilderUsage {
    @Test
    public void agreement_version_builder_usage() {
        LocalDate now = LocalDate.now();

        AgreementVersion av = AgreementVersionBuilder.agreementVersion()
                .marketplaceId("marketplaceId")
                .customer(new Customer("customer"))
                .supplier(new Supplier("supplier"))
                .createdBy("someone")
                .startDate(now)
                .supplierContact("contact")
                .description("description")
                .id("id")
                .agreementId("agreementId")
                .versionNumber(2)
                .createdDate(now)
                .updatedTime(now.atStartOfDay())
                .versionStatus(AgreementVersionStatus.ACTIVE)
                .priceSheetResources(new HashMap<>())
                .isVendorReviewed(true)
                .isCustomerReviewed(true)
                .hasWarnings(false)
                .build();

        assertEquals("marketplaceId", av.getMarketplaceId());
        assertEquals("customer", av.getCustomer().name);
        assertEquals("supplier", av.getSupplier().name);
        assertEquals("someone", av.getCreatedBy());
        assertEquals(now, av.getStartDate());
        assertEquals("contact", av.getSupplierContact());
        assertEquals("description", av.getDescription());
        assertEquals("id", av.getId());
        assertEquals("agreementId", av.getAgreementId());
        assertEquals(2, av.getVersionNumber());
        assertEquals(now, av.getCreatedDate());
        assertEquals(now.atStartOfDay(), av.getUpdatedTime());
        assertEquals(AgreementVersionStatus.ACTIVE, av.getVersionStatus());
        assertEquals(Collections.emptyMap(), av.getPriceSheetResources());
        assertEquals(true, av.isVendorReviewed());
        assertEquals(true, av.isCustomerReviewed());
        assertEquals(false, av.isHasWarnings());
    }
}
