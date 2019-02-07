package com.example.glossaryofindustry.container.record;

import com.example.glossaryofindustry.container.WebRecord;

public class GlossarysRecord implements WebRecord {

    /** 用語 */
    private String terminology;

    /** 説明文 */
    private String wordDescription;

    public String getTerminology() {
        return terminology;
    }

    public void setTerminology(String terminology) {
        this.terminology = terminology;
    }

    public String getWordDescription() {
        return wordDescription;
    }

    public void setWordDescription(String wordDescription) {
        this.wordDescription = wordDescription;
    }

}
