// License: GPL. For details, see LICENSE file.
package uberterracer;

/**
 * The Class UberTerracerRuntimeException indicates errors from the UberTerracer Plugin.
 *
 * @author casualwalker - Copyright 2009 CloudMade Ltd
 */
public class UberTerracerRuntimeException extends RuntimeException {

    /**
     * Default constructor.
     */
    public UberTerracerRuntimeException() {
        super();
    }

    public UberTerracerRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UberTerracerRuntimeException(String message) {
        super(message);
    }

    public UberTerracerRuntimeException(Throwable cause) {
        super(cause);
    }

}
