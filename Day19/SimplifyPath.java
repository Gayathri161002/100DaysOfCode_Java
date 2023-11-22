import java.util.*;
public class SimplifyPath
{
    public static String simplifyPath(String path)
    {
        String[] path_ary=path.split("/");
        Stack<String> stk=new Stack<>();
       
        for(String str : path_ary)
        {
            if(str.equals(".."))
            {
                if(!stk.isEmpty())
                {
                    stk.pop();
                }
            }
           
            else if(!str.equals(".") && !str.isEmpty())
            {
                stk.push(str);
            }
        }
       
        StringBuilder result = new StringBuilder("/");
       
        for(String s : stk)
        {
            result.append(s).append("/");
        }
       
        if (result.length() > 1) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String path=s.nextLine();
        System.out.println(simplifyPath(path));
    }
}

/*
https://leetcode.com/problems/simplify-path/

The canonical path should have the following format:

The path starts with a single slash '/'.
Any two directories are separated by a single slash '/'.
The path does not end with a trailing '/'.
The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
Return the simplified canonical path.

 

Example 1:

Input: path = "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.

Example 2:

Input: path = "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.

Example 3:

Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
*/