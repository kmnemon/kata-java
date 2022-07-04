package k01_tdd;

public class testMultipicaiton {
    Dollar five = new Dollar(5);
    five.times(2);
    assertEquals(10, five.amount);
}
