/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICPC_Assiut_University_Community;

import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author akram
 *
 * @link https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/W
 *
 *
 */
public class W_Mathematical_Expression {

    public static void main(String[] args) throws ScriptException {

        Scanner input = new Scanner(System.in);

        ScriptEngineManager mgr = new ScriptEngineManager();

        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        String foo = input.nextLine();
        foo = foo.replace("=", "==");
        if (((Boolean) engine.eval(foo)) == false) {

            int x = foo.indexOf("=");
            foo = foo.substring(0, x);
            System.out.println((int) engine.eval(foo));

        } else {
            System.out.println("Yes");
        }

        input.close();
    }

}
