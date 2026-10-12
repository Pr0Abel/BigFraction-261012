import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class BigFractionTest {
    @Test
    public void testBigFractions() {
        BigFraction a = new BigFraction();
        BigFraction b = new BigFraction("2","3");
        BigFraction c = new BigFraction(-4L,-5L);
        BigFraction d = new BigFraction(-3,8);
        BigFraction e = new BigFraction(new BigInteger("1"), new BigInteger("2"));
    }

    @Test
    public void testParse() {
        BigFraction a = BigFraction.parse("-2/5");
    }


    @Test
    public void testEquals() {
        BigFraction a = BigFraction.parse(  "-2/5");
        BigFraction b = BigFraction.parse( "-2/5");
        Assert.assertTrue(a.equals(b));
    }

    @Test
    public void testLessthan () {
        BigFraction a = BigFraction.parse("1/3");
        BigFraction b = BigFraction.parse( "2/3");
        Assert.assertTrue(BigFractions.isAlessthanB(a,b));
    }

    @Test
    public void testRelations() {
        BigFraction a = BigFraction.parse("1/3");
        BigFraction b = BigFraction.parse("2/3");
        Assert.assertTrue(BigFractions.isAlessthanB (a, b));
        Assert.assertFalse (BigFractions.isAgreterThanB(a, b));
        Assert.assertFalse (BigFractions.equals(a, b));
        Assert.assertTrue(BigFractions.isAlessthanOrEqualB(a, b));
        Assert.assertFalse (BigFractions.isAgreaterthanOrEqualB (a, b));
        Assert.assertTrue(BigFractions.notEquals(a, b));
    }

}
