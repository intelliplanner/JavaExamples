package a.immutable_class;

import java.util.Date;

/** Purpose: Encapsulates test main behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class TestMain
{
        
        public static void main(String[] args)
    {
        ImmutableClass im = ImmutableClass.createNewInstance(100,"test", new Date());
        System.out.println(im);

        ImmutableClass im1 = ImmutableClass.createNewInstance(101,"test1", new Date(10));
        System.out.println(im1);

        tryModification(im.getImmutableField1(),im.getImmutableField2(),im.getMutableField());
        System.out.println(im);

        // second test

        ImmutableAndSingletonClassTest obj = ImmutableAndSingletonClassTest.createNewInstance(100,"test", new Date());
        System.out.println(obj);

        ImmutableAndSingletonClassTest ob2 = ImmutableAndSingletonClassTest.createNewInstance(101,"test1", new Date(10));
        System.out.println(ob2);

        tryModification(obj.getT1(),obj.getStr(),obj.getMutDate());
        System.out.println(obj);

    }

    /** Purpose: Performs the try modification operation. */
    private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField)
    {
        immutableField1 = 10000;
        immutableField2 = "test changed";
        mutableField.setDate(10);
    }
}