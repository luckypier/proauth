package org.baeldung.web.controller;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

import org.baeldung.web.dto.Dummy;
import org.baeldung.web.dto.Foo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class DummyController {

    public DummyController() {
        super();
    }

    // API - read
    // @PreAuthorize("#oauth2.hasScope('foo') and #oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/dummy/{id}")
    @ResponseBody
    public Dummy findById(@PathVariable final long id) {
        return new Dummy(Long.parseLong(randomNumeric(2)), randomAlphabetic(4));
    }

    // API - write
    // @PreAuthorize("#oauth2.hasScope('foo') and #oauth2.hasScope('write')")
    @RequestMapping(method = RequestMethod.POST, value = "/dummy")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Dummy create(@RequestBody final Dummy foo) {
        foo.setId(Long.parseLong(randomNumeric(2)));
        return foo;
    }

}
