package com.endoflineblog.type_safe_builder.submodule_02;

import com.endoflineblog.type_safe_builder.submodule_02.av.AgreementVersionStatus;
import com.endoflineblog.type_safe_builder.submodule_02.av.Customer;
import com.endoflineblog.type_safe_builder.submodule_02.av.Supplier;
import lombok.Data;
import org.jilt.Builder;
import org.jilt.BuilderStyle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * This is exactly equivalent to the Type-Safe Builder for
 * {@code AgreementVersion} from the {@code 02-type-safe-agreement-version-builder}
 * submodule.
 */
@Data
@Builder(style = BuilderStyle.TYPE_SAFE)
public final class AgreementVersion {
    private final String marketplaceId;
    private final Customer customer;
    private final Supplier supplier;
    private final String createdBy;
    private final LocalDate startDate;
    private final String supplierContact;
    private final String description;
    private final String id;
    private final String agreementId;
    private final int versionNumber;
    private final LocalDate createdDate;
    private final LocalDateTime updatedTime;
    private final AgreementVersionStatus versionStatus;
    private final Map<String, String> priceSheetResources;
    private final boolean isVendorReviewed;
    private final boolean isCustomerReviewed;
    private final boolean hasWarnings;
}
