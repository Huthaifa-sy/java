public class MasterStudent extends Student {
    private String thesisTitle;

    public MasterStudent(String name, double score, String thesisTitle) {
        super(name, score); // استدعاء مُنشئ الفئة الرئيسية Student
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    @Override
    public int getLoanDays() {
        return 30; // طلاب الماجستير لديهم فترة استعارة أطول
    }

    @Override
    public String toString() {
        return super.toString() + ", masteroppgave: " + thesisTitle;
    }
}