package com.endoflineblog.type_safe_builder;

import com.endoflineblog.type_safe_builder.av.AgreementVersionStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

public interface AgreementVersionBuilders {
    interface MarketplaceId {
        Customer marketplaceId(String marketplaceId);
    }

    interface Customer {
        AgreementVersionBuilders.Supplier customer(com.endoflineblog.type_safe_builder.av.Customer customer);
    }

    interface Supplier {
        CreatedBy supplier(com.endoflineblog.type_safe_builder.av.Supplier supplier);
    }

    interface CreatedBy {
        StartDate createdBy(String createdBy);
    }

    interface StartDate {
        SupplierContact startDate(LocalDate startDate);
    }

    interface SupplierContact {
        Description supplierContact(String supplierContact);
    }

    interface Description {
        Id description(String description);
    }

    interface Id {
        AgreementId id(String id);
    }

    interface AgreementId {
        VersionNumber agreementId(String agreementId);
    }

    interface VersionNumber {
        CreatedDate versionNumber(int versionNumber);
    }

    interface CreatedDate {
        UpdatedTime createdDate(LocalDate createdDate);
    }

    interface UpdatedTime {
        VersionStatus updatedTime(LocalDateTime updatedTime);
    }

    interface VersionStatus {
        PriceSheetResources versionStatus(AgreementVersionStatus versionStatus);
    }

    interface PriceSheetResources {
        IsVendorReviewed priceSheetResources(Map<String, String> priceSheetResources);
    }

    interface IsVendorReviewed {
        IsCustomerReviewed isVendorReviewed(boolean isVendorReviewed);
    }

    interface IsCustomerReviewed {
        HasWarnings isCustomerReviewed(boolean isCustomerReviewed);
    }

    interface HasWarnings {
        Optionals hasWarnings(boolean hasWarnings);
    }

    interface Optionals {
        AgreementVersion build();
    }
}
