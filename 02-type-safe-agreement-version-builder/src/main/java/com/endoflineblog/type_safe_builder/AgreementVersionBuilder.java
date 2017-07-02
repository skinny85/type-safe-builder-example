package com.endoflineblog.type_safe_builder;

import com.endoflineblog.type_safe_builder.av.AgreementVersionStatus;
import com.endoflineblog.type_safe_builder.av.Customer;
import com.endoflineblog.type_safe_builder.av.Supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

public class AgreementVersionBuilder implements
        AgreementVersionBuilders.MarketplaceId,
        AgreementVersionBuilders.Customer,
        AgreementVersionBuilders.Supplier,
        AgreementVersionBuilders.CreatedBy,
        AgreementVersionBuilders.StartDate,
        AgreementVersionBuilders.SupplierContact,
        AgreementVersionBuilders.Description,
        AgreementVersionBuilders.Id,
        AgreementVersionBuilders.AgreementId,
        AgreementVersionBuilders.VersionNumber,
        AgreementVersionBuilders.CreatedDate,
        AgreementVersionBuilders.UpdatedTime,
        AgreementVersionBuilders.VersionStatus,
        AgreementVersionBuilders.PriceSheetResources,
        AgreementVersionBuilders.IsVendorReviewed,
        AgreementVersionBuilders.IsCustomerReviewed,
        AgreementVersionBuilders.HasWarnings,
        AgreementVersionBuilders.Optionals {
    public static AgreementVersionBuilders.MarketplaceId agreementVersion() {
        return new AgreementVersionBuilder();
    }

    private AgreementVersionBuilder() {
    }

    private String marketplaceId;
    private Customer customer;
    private Supplier supplier;
    private String createdBy;
    private LocalDate startDate;
    private String supplierContact;
    private String description;
    private String id;
    private String agreementId;
    private int versionNumber;
    private LocalDate createdDate;
    private LocalDateTime updatedTime;
    private AgreementVersionStatus versionStatus;
    private Map<String, String> priceSheetResources;
    private boolean isVendorReviewed;
    private boolean isCustomerReviewed;
    private boolean hasWarnings;

    @Override
    public AgreementVersionBuilders.Customer marketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    @Override
    public AgreementVersionBuilders.Supplier customer(Customer customer) {
        this.customer = customer;
        return this;
    }

    @Override
    public AgreementVersionBuilders.CreatedBy supplier(Supplier supplier) {
        this.supplier = supplier;
        return this;
    }

    @Override
    public AgreementVersionBuilders.StartDate createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public AgreementVersionBuilders.SupplierContact startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public AgreementVersionBuilders.Description supplierContact(String supplierContact) {
        this.supplierContact = supplierContact;
        return this;
    }

    @Override
    public AgreementVersionBuilders.Id description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public AgreementVersionBuilders.AgreementId id(String id) {
        this.id = id;
        return this;
    }

    @Override
    public AgreementVersionBuilders.VersionNumber agreementId(String agreementId) {
        this.agreementId = agreementId;
        return this;
    }

    @Override
    public AgreementVersionBuilders.CreatedDate versionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    @Override
    public AgreementVersionBuilders.UpdatedTime createdDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    @Override
    public AgreementVersionBuilders.VersionStatus updatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    @Override
    public AgreementVersionBuilders.PriceSheetResources versionStatus(AgreementVersionStatus versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }

    @Override
    public AgreementVersionBuilders.IsVendorReviewed priceSheetResources(Map<String, String> priceSheetResources) {
        this.priceSheetResources = priceSheetResources;
        return this;
    }

    @Override
    public AgreementVersionBuilders.IsCustomerReviewed isVendorReviewed(boolean isVendorReviewed) {
        this.isVendorReviewed = isVendorReviewed;
        return this;
    }

    @Override
    public AgreementVersionBuilders.HasWarnings isCustomerReviewed(boolean isCustomerReviewed) {
        this.isCustomerReviewed = isCustomerReviewed;
        return this;
    }

    @Override
    public AgreementVersionBuilders.Optionals hasWarnings(boolean hasWarnings) {
        this.hasWarnings = hasWarnings;
        return this;
    }

    @Override
    public AgreementVersion build() {
        return new AgreementVersion(marketplaceId, customer, supplier,
                createdBy, startDate, supplierContact, description, id,
                agreementId, versionNumber, createdDate, updatedTime,
                versionStatus, priceSheetResources, isVendorReviewed,
                isCustomerReviewed, hasWarnings);
    }
}
