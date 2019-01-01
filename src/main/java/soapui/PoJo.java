
package soapui;

/**
 * Simple Example PoJo Class.
 */
public class PoJo {

    private String str;
    private Boolean flag;
    private Long number;

    public PoJo createPojo() {
        return new PoJo("aString", true, Long.MIN_VALUE);
    }

    /**
     * Initialise a new pojo with values.
     *
     * @param str the str
     * @param flag the flag
     * @param number the number
     */
    private PoJo(final String str, final Boolean flag, final Long number) {
        super();
        this.str = str;
        this.flag = flag;
        this.number = number;
    }

    /**
     * @return the str property.
     */
    public String getStr() {
        return this.str;
    }

    /**
     * @param str the new str property value.
     */
    public void setStr(final String str) {
        this.str = str;
    }

    /**
     * @return the flag property.
     */
    public Boolean getFlag() {
        return this.flag;
    }

    /**
     * Sets the flag property.
     *
     * @param flag the new flag property.
     */
    public void setFlag(final Boolean flag) {
        this.flag = flag;
    }

    /**
     * Gets the number.
     *
     * @return the number property.
     */
    public Long getNumber() {
        return this.number;
    }

    /**
     * Sets the number property..
     *
     * @param number the new number property.
     */
    public void setNumber(final Long number) {
        this.number = number;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [str=%s, flag=%s, number=%s]", this.getClass().getSimpleName(), this.str, this.flag, this.number);
    }
}
