package com.endoflineblog.type_safe_builder;

import com.endoflineblog.type_safe_builder.av.AgreementVersionStatus;
import com.endoflineblog.type_safe_builder.av.Customer;
import com.endoflineblog.type_safe_builder.av.Supplier;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * This is the Agreement Version from the examples.
 * I'm using Lombok for brevity, but that's mostly a detail -
 * the example would work exactly the same if I just spelled out the code explicitly.
 */
@Data
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
