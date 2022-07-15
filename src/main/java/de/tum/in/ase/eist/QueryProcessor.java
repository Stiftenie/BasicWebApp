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
            String s = query.substring(57);
            String[] stri = s.split(", ");
            int length = stri.length;
            int[] in = new int[stri.length];
            for (int i = 0; i < length; i++) {
                in[i] = Integer.parseInt(stri[i]);
            }
            int f = in[0];
            for (int i = 1; i < length; i++) {
                if (in[i] > f) {
                    f = in[i];
                }
            }
            System.out.println(f);
            return f + "";
        } else if (query.contains("what is")) {
            String s = query.substring(18);
            String[] stri = s.split(" plus ");
            int one = Integer.parseInt(stri[0]);
            int two = Integer.parseInt(stri[1]);
            System.out.println(one + two);
            return one + two + "";
        }
        return "";
    }

    public static void main(String[] args) {
        QueryProcessor p = new QueryProcessor();
        p.process("47fcaf10: what is 4 plus 9");
    }

}
