
package com.mkdika.springsproc.runner;

import com.mkdika.springsproc.storeproc.URSProcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
@Component
public class SProcRunnerTest  implements CommandLineRunner {
    
    @Autowired
    private URSProcService urSprocService;

    @Override
    public void run(String... strings) throws Exception {
        String result = urSprocService.Updateurdetnote("2c90898357747e1a015774bbda0d01a5", "TESTING BERT :)");
        System.out.println(result);
    }
    
}
