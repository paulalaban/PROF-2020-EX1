package main.java.es.upm.p.labandeira.proyecto_control_1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.apache.commons.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	GitHub github = GitHub.connectAnonymously();

    	GHRepository repo = github.getRepository("GRISE-UPM/PROF-2020-EX1");

    	System.out.println(IOUtils.toString(repo.getReadme().read(), StandardCharsets.UTF_8));
    }
}
