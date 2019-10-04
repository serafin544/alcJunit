import calculator.Calculator;
import org.junit.Test;
import org.junit.Assert;


public class CalcTest {

    @Test
    public void addTest(){
        //Given
        Calculator calc = new Calculator();

        int x = 1;
        int y = 2;

        int expected = 3;


        //When
        int actual = calc.add(x,y);


        //Then
        Assert.assertEquals(expected,actual);


    }
    @Test
    public void subtractTest(){
        Calculator calc = new Calculator();
        int x = 1;
        int y = 2;
        int expected = 1;
        int actual = calc.subtract(y,x);

        Assert.assertEquals(expected,actual);


    }

    @Test
    public void multiplyTest(){
        Calculator calc = new Calculator();
        int y = 2;
        int x = 2;
        int expected = 4;
        int actual = (int) calc.multiply(x,y);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void divideTest(){
        Calculator calc = new Calculator();
        int x = 8;
        int y = 4;
        int expected = 2;
        int actual = (int) calc.divide(x,y);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void squareTest(){
        Calculator calc = new Calculator();
        int x = 2;
        int expected = 4;
        int actual = calc.square(x);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void squareRootTest(){
        Calculator calc = new Calculator();
        double x = 4.0;
        double expected = 2.0;
        double actual = calc.squareRoot(x);
        Assert.assertEquals(expected,actual,0.1);
    }
    @Test
    public void exponentsTest(){
        Calculator calc = new Calculator();
        double x = 4.0;
        double y = 2.0;
        double expected = 16.0;
        double actual = calc.exponents(x,y);
        Assert.assertEquals(expected,actual,0.0001);

    }
    @Test
    public void sineTest(){
        Calculator calc = new Calculator();
        double degrees = 30;
        double radians = Math.toRadians(degrees);
        double expected = 0.5;
        double actual = calc.sineMethod(radians);
    }


}
