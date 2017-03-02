package com.edi.poc.domain;

import java.io.Serializable;

/**
 * Person definition.
 *
 * Code generated by Apache Ignite Schema Import utility: 02/24/2015.
 */
public class Person implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for id. */
    private long id;

    /** Value for first name. */
    private String firstName;

    /** Value for last name. */
    private String lastName;

    /**
     * Empty constructor.
     */
    public Person() {
        // No-op.
    }

    /**
     * Full constructor.
     */
    public Person(
        long id,
        String firstName,
        String lastName
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Gets id.
     *
     * @return Value for id.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id New value for id.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets first name.
     *
     * @return Value for first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName New value for first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return Value for last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName New value for last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** {@inheritDoc} */
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Person))
            return false;

        Person that = (Person)o;

        if (id != that.id)
            return false;

        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null)
            return false;

        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null)
            return false;

        return true;
    }

    /** {@inheritDoc} */
    @Override public int hashCode() {
        int res = (int)(id ^ (id >>> 32));

        res = 31 * res + (firstName != null ? firstName.hashCode() : 0);

        res = 31 * res + (lastName != null ? lastName.hashCode() : 0);

        return res;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return "Person [id=" + id +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            "]";
    }
}