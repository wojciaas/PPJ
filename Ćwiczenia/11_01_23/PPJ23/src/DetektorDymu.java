public class DetektorDymu {
    public static void sprawdz() throws Alarm{
        double rand = Math.random();
        if (rand > 0.5) throw new Alarm();
    }
}
