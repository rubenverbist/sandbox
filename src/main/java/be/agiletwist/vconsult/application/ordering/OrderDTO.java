package be.agiletwist.vconsult.application.ordering;

import java.util.List;

public class OrderDTO {
    private String orderNumber;
    private PrescriberDTO prescriber;
    private List<AnalysisDTO> analyses;

    public String getOrderNumber() {
        return orderNumber;
    }

    public PrescriberDTO getPrescriber() {
        return prescriber;
    }

    public List<AnalysisDTO> getAnalyses() {
        return analyses;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPrescriber(PrescriberDTO prescriber) {
        this.prescriber = prescriber;
    }

    public void setAnalyses(List<AnalysisDTO> analyses) {
        this.analyses = analyses;
    }
}
