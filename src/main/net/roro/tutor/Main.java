package net.roro.tutor;

import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(args));
        System.out.println(StringUtils.swapCase(Arrays.toString(args)));
    }
}