package freakster.hack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by freakster on 7/3/2015.
 * Given an absolute path for a file (Unix-style), simplify it.

 For example,
 path = "/home/", => "/home"
 path = "/a/./b/../../c/", => "/c"

 click to show corner cases.
 Corner Cases:

 Did you consider the case where path = "/../"?
 In this case, you should return "/".
 Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 In this case, you should ignore redundant slashes and return "/home/foo".
 */


public class SimplifyPath {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String rest = simplifyPath(input);
        System.out.println("rest = " + rest);

    }

    public static String simplifyPath(String path)
    {
        String simple = null;
        if(path == null || path.isEmpty())
        {
            return simple;
        }

        String[] splits = path.split("/");

        Stack stack = new Stack();
        for (String s: splits) {
            if(s.equals("..") && !stack.isEmpty()){
                stack.pop();
            }
            else if (!s.equals(".") && !s.equals("..") && !s.isEmpty()){
                stack.push(s);
            }

        }

        if(stack.isEmpty()) return "/";

        StringBuilder stringBuilder = new StringBuilder();

        while(!stack.isEmpty())
        {
            stringBuilder.insert(0, "/" + stack.pop());

        }

        simple = stringBuilder.toString();


    return simple;
    }
}
