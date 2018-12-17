package com.mkdika.springsproc.storeproc;

import de.zalando.sprocwrapper.SProcCall;
import de.zalando.sprocwrapper.SProcParam;
import de.zalando.sprocwrapper.SProcService;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 */
@SProcService
public interface URSProcService {

    @SProcCall()
    String Updateurdetnote(@SProcParam String urdetid, @SProcParam String newnote);

}
