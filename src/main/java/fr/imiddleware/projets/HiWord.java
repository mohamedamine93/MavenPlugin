package fr.imiddleware.projets;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
 
/**
 * "NewMavenGoal" est le nom du Goal qu'on va créer.
 *
 */
@Mojo( name = "SecondMavenGoal")
public class HiWord extends AbstractMojo
{
    public void execute() throws MojoExecutionException
    {
        getLog().info( "Hi, Maven." );
    }
}
