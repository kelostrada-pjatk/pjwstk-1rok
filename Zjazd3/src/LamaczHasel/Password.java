package LamaczHasel;

/**
 * @author bartosz.kalinowski
 */

public class Password {
    String password;
    
    public Password(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Password) {
            return password.equals(((Password)o).password);
        }
        else if (o instanceof String) {
            return password.equals(o);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return password.hashCode();
    }
}
