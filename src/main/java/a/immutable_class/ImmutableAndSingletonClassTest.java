package a.immutable_class;

import java.util.Date;

/**
 * Encapsulates immutable and singleton class test behavior for the represented example workflow.
 */
public final class ImmutableAndSingletonClassTest {
    private final Integer t1;
    private final String str;
    private final Date mutDate;
    static ImmutableAndSingletonClassTest obj = null;

    /**
 * Creates a configured immutable and singleton class test instance for the represented workflow.
 */
    private ImmutableAndSingletonClassTest(Integer t1, String str, Date mutDate) {
        this.t1 = t1;
        this.str = str;
        this.mutDate = new Date(mutDate.getTime());
    }

    /**
 * Performs the create new instance operation required by the represented example.
 */
    public static ImmutableAndSingletonClassTest createNewInstance(Integer t1, String str, Date mutDate) {
//        return new ImmutableClassTest(t1, str, mutDate);
        if (obj == null) {
            obj = new ImmutableAndSingletonClassTest(t1, str, mutDate);
        }
        return obj;
    }

    /**
 * Retrieves or locates get t1 data needed for decision-making.
 */
    public Integer getT1() {
        return t1;
    }

    /**
 * Retrieves or locates get str data needed for decision-making.
 */
    public String getStr() {
        return str;
    }

    /**
 * Retrieves or locates get mut date data needed for decision-making.
 */
    public Date getMutDate() {
        return new Date(mutDate.getTime());
    }

    @Override
    /**
 * Provides a readable representation for reporting or diagnostics.
 */
    public String toString() {
        return "ImmutableAndSingletonClassTest{" +
                "t1=" + t1 +
                ", str='" + str + '\'' +
                ", mutDate=" + mutDate +
                '}';
    }
}
