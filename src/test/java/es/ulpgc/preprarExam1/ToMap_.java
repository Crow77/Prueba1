package es.ulpgc.preprarExam1;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ToMap_ {
    private ToMap toMap;
    private static  Map<String, Double>sales = new HashMap<String, Double>();

    @Before
    public void setUp() throws Exception {
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

    public static class ToMap {
        public double of(String state, int price) {
            for (String key : sales.keySet()){
                if (key.equals(state)) return price*sales.get(key);
            }
            return 0;
        }
    }
}
