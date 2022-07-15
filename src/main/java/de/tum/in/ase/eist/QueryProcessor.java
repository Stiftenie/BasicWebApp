package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Stephanie";
        } else if (query.contains("which of the following numbers is the largest")) { // TODO extend the programm here
            String[] l;
            String s = query.substring(57);
            l = s.split(",");
            int[] in = new int[4];
            for (int i = 0; i < 4; i++) {
                in[i] = Integer.parseInt(l[i]);
            }
            int f = in[0];
            for (int i = 1; i < 4; i++) {
                if (in[i] > f) {
                    f = in[i];
                }
            }
            return f + "";
        }
        return "";
    }
}
