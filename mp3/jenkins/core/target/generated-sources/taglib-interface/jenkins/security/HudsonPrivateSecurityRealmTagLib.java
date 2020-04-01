
package jenkins.security;

import java.util.Map;
import groovy.lang.Closure;
import org.kohsuke.stapler.jelly.groovy.TagLibraryUri;
import org.kohsuke.stapler.jelly.groovy.TypedTagLibrary;

@TagLibraryUri("/hudson/security/HudsonPrivateSecurityRealm")
public interface HudsonPrivateSecurityRealmTagLib
    extends TypedTagLibrary
{


    /**
     * 
     */
    void index(Map args, Closure body);

    /**
     * 
     */
    void index(Closure body);

    /**
     * 
     */
    void index(Map args);

    /**
     * 
     */
    void index();

    /**
     * 
     */
    void signupWithFederatedIdentity(Map args, Closure body);

    /**
     * 
     */
    void signupWithFederatedIdentity(Closure body);

    /**
     * 
     */
    void signupWithFederatedIdentity(Map args);

    /**
     * 
     */
    void signupWithFederatedIdentity();

    /**
     * 
     */
    void sidepanel(Map args, Closure body);

    /**
     * 
     */
    void sidepanel(Closure body);

    /**
     * 
     */
    void sidepanel(Map args);

    /**
     * 
     */
    void sidepanel();

    /**
     * 
     */
    void loginLink(Map args, Closure body);

    /**
     * 
     */
    void loginLink(Closure body);

    /**
     * 
     */
    void loginLink(Map args);

    /**
     * 
     */
    void loginLink();

    /**
     * 
     */
    void success(Map args, Closure body);

    /**
     * 
     */
    void success(Closure body);

    /**
     * 
     */
    void success(Map args);

    /**
     * 
     */
    void success();

    /**
     * 
     */
    void _entryForm(Map args, Closure body);

    /**
     * 
     */
    void _entryForm(Closure body);

    /**
     * 
     */
    void _entryForm(Map args);

    /**
     * 
     */
    void _entryForm();

    /**
     * 
     */
    void addUser(Map args, Closure body);

    /**
     * 
     */
    void addUser(Closure body);

    /**
     * 
     */
    void addUser(Map args);

    /**
     * 
     */
    void addUser();

    /**
     * 
     */
    void config(Map args, Closure body);

    /**
     * 
     */
    void config(Closure body);

    /**
     * 
     */
    void config(Map args);

    /**
     * 
     */
    void config();

    /**
     * 
     */
    void signup(Map args, Closure body);

    /**
     * 
     */
    void signup(Closure body);

    /**
     * 
     */
    void signup(Map args);

    /**
     * 
     */
    void signup();

    /**
     * 
     */
    void firstUser(Map args, Closure body);

    /**
     * 
     */
    void firstUser(Closure body);

    /**
     * 
     */
    void firstUser(Map args);

    /**
     * 
     */
    void firstUser();

}
