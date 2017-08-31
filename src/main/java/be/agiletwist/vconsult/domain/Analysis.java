package be.agiletwist.vconsult.domain;

public abstract class Analysis {
    private AnalysisNumber analysisNumber;

    public AnalysisNumber getAnalysisNumber() {
        return analysisNumber;
    }

    public void setAnalysisNumber(AnalysisNumber analysisNumber) {
        this.analysisNumber = analysisNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Analysis analysis = (Analysis) o;

        return analysisNumber != null ? analysisNumber.equals(analysis.analysisNumber) : analysis.analysisNumber == null;
    }

    @Override
    public int hashCode() {
        return analysisNumber != null ? analysisNumber.hashCode() : 0;
    }
}
