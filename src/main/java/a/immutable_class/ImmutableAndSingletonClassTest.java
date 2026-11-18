package a.immutable_class;

import java.util.Date;

public final class ImmutableAndSingletonClassTest {
    private final Integer t1;
    private final String str;
    private final Date mutDate;
    static ImmutableAndSingletonClassTest obj = null;

    private ImmutableAndSingletonClassTest(Integer t1, String str, Date mutDate) {
        this.t1 = t1;
        this.str = str;
        this.mutDate = new Date(mutDate.getTime());
    }

    public static ImmutableAndSingletonClassTest createNewInstance(Integer t1, String str, Date mutDate) {
//        return new ImmutableClassTest(t1, str, mutDate);
        if (obj == null) {
            obj = new ImmutableAndSingletonClassTest(t1, str, mutDate);
        }
        return obj;
    }

    public Integer getT1() {
        return t1;
    }

    public String getStr() {
        return str;
    }

    public Date getMutDate() {
        return new Date(mutDate.getTime());
    }

    @Override
    public String toString() {
        return "ImmutableAndSingletonClassTest{" +
                "t1=" + t1 +
                ", str='" + str + '\'' +
                ", mutDate=" + mutDate +
                '}';
    }
}
