package org.krisdrum.spring.test.tutorial24;


import javax.annotation.Resource;

/**
 * Created by chris on 2015-02-27.
 */
public class Logger {
//    @Autowired(required = false)
//    @Autowired
//    @Qualifier("toconsole")
    @Resource(name = "consolewritter")
    private ConsoleWriter consoleWriter;

//    @Autowired
//    @Qualifier("filewriter")
    @Resource(name = "squirrel")
    private LogWriter fileWriter;

//    @Autowired
//     public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
//        this.consoleWriter = consoleWriter;
//        this.fileWriter = fileWriter;
//    }

//    @Autowired
//    public Logger(ConsoleWriter consoleWriter) {
//        this.consoleWriter = consoleWriter;
//    }

    //    @Autowired
//    public void setConsoleWriter(ConsoleWriter consoleWriter) {
//        this.consoleWriter = consoleWriter;
//    }

//    @Autowired
//    public void setFileWritersdfsdfsdf(FileWriter fileWriter) {
//        this.fileWriter = fileWriter;
//    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        if (consoleWriter != null) {
            consoleWriter.write(text);
        }
    }
}
