package com.SearchAndPay.Models;

import javax.persistence.*;

@Entity
@Table(name="MeasureTypes")
public class MeasureType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MeasureTypeId")
    private int MeasureTypeId;

    @Column(name="DisplayName")
    private String DisplayName;

    @Column(name="AllowDecimal")
    private boolean AllowDecimal;

    @Column(name="Unit")
    private String Unit;

    public int getMeasureTypeId() {
        return MeasureTypeId;
    }

    public void setMeasureTypeId(int measureTypeId) {
        MeasureTypeId = measureTypeId;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String displayName) {
        DisplayName = displayName;
    }

    public boolean isAllowDecimal() {
        return AllowDecimal;
    }

    public void setAllowDecimal(boolean allowDecimal) {
        AllowDecimal = allowDecimal;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }
}
