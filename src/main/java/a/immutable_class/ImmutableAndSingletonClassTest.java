package a.immutable_class;

import java.util.Date;

/** Purpose: Encapsulates immutable and singleton class test behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public final class ImmutableAndSingletonClassTest {
    private final Integer t1;
    private final String str;
    private final Date mutDate;
    static ImmutableAndSingletonClassTest obj = null;

    /** Purpose: Creates a immutable and singleton class test instance. */
    private ImmutableAndSingletonClassTest(Integer t1, String str, Date mutDate) {
        this.t1 = t1;
        this.str = str;
        this.mutDate = new Date(mutDate.getTime());
    }

    /** Purpose: Performs the create new instance operation. */
    public static ImmutableAndSingletonClassTest createNewInstance(Integer t1, String str, Date mutDate) {
//        return new ImmutableClassTest(t1, str, mutDate);
        if (obj == null) {
            obj = new ImmutableAndSingletonClassTest(t1, str, mutDate);
        }
        return obj;
    }

    /** Purpose: Retrieves get t1 data. */
    public Integer getT1() {
        return t1;
    }

    /** Purpose: Retrieves get str data. */
    public String getStr() {
        return str;
    }

    /** Purpose: Retrieves get mut date data. */
    public Date getMutDate() {
        return new Date(mutDate.getTime());
    }

    @Override
    
    /** Purpose: Provides a readable object representation. */
    public String toString() {
        return "ImmutableAndSingletonClassTest{" +
                "t1=" + t1 +
                ", str='" + str + '\'' +
                ", mutDate=" + mutDate +
                '}';
    }
}
