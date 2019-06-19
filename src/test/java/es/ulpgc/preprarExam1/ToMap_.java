package es.ulpgc.preprarExam1;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ToMap_ {
    private ToMap toMap;
    private static  Map<String, Double>sales;

    @Before
    public void setUp() {
        sales = new HashMap<String, Double>();
        toMap = new ToMap();
        sales.put("KY", 3.0);
        sales.put("AL", 1.0);
        sales.put("GA", 2.0);
        sales.put("SC", 4.0);
    }

    @Test
    public void give_KY_and_4_should_return_12() {
        assertThat(toMap.of("KY", 4)).isEqualTo(12);
    }
    @Test
    public void give_AL_and_7_should_return_7() {
        assertThat(toMap.of("AL", 7)).isEqualTo(7);
    }
    @Test
    public void give_GA_and_8_should_return_16() {
        assertThat(toMap.of("GA", 8)).isEqualTo(16);
    }
    @Test
    public void give_SC_and_10_should_return_10() {
        assertThat(toMap.of("SC", 10)).isEqualTo(40);
    }
    public static class ToMap {
        public double of(String state, int price) {
            for (String key : sales.keySet()){
                if (key.equals(state)) return price*sales.get(key);
            }
            return 0;
        }
    }
}
