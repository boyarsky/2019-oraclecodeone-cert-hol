// DownloadContent.java
package com.oracle.codeone.sessions.pdf;

import com.oracle.codeone.sessions.secret.Drafts;
import com.oracle.codeone.sessions.secret.Final;

public class DownloadContent {

    public static void main(String[] args) {
        System.out.println("Final:");
        System.out.println(Final.getDecks());

        System.out.println("Drafts:");
        System.out.println(Drafts.getDrafts());
    }
}

