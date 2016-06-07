package com.sparg.java.command;

import com.sparg.java.encryption.utils.Encryption;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;


/**
 * @author: vimal.sengoden
 * Date: 11/14/2014
 * Time: 11:41 AM
 */
public class Do {

    public static Option encrypt = new Option( "e", "encrypt", true, "Encrypts the provided values");
    public static Option decrypt = new Option( "d", "decrypt", true, "Decrypts the provided values" );

    public static Options options = new Options();

    static {
        options.addOption(encrypt);
        options.addOption(decrypt);
    }

    public static void main(String[] args) {

        // create the parser
        CommandLineParser parser = new PosixParser();

        try {
            // parse the command line arguments
            CommandLine line = parser.parse( options, args );

            executeCommand(line);

        } catch( ParseException exp ) {
            printCommandLineHelp();
            System.err.println( "Parsing failed.  Reason: " + exp.getMessage() );
        } catch ( Exception e) {
            System.err.println( "Command execution failed  Reason: " + e.getMessage() );
            printCommandLineHelp();
        }
    }

    private static void printCommandLineHelp() {
        new HelpFormatter().printHelp("Do", options);
    }

    public static void executeCommand(CommandLine line) throws Exception {
        if(line.hasOption(encrypt.getOpt())) {
            System.out.println(Encryption.encrypt(line.getOptionValue(encrypt.getOpt()), Encryption.EncryptionType.DEFAULT));
        }

        if(line.hasOption(decrypt.getOpt())) {
            System.out.println(Encryption.decrypt(line.getOptionValue(decrypt.getOpt()), Encryption.EncryptionType.DEFAULT));
        }
    }
}
