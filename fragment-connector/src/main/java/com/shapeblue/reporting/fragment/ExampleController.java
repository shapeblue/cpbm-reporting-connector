package com.shapeblue.reporting.fragment;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vmops.web.controllers.AbstractAuthenticatedController;

/**
 *  This is an example controller. Please rename the request mapping of this controller to /connector_resources/{artifactId or bundleSymbolicname with dots replaced with underscore(if any)} 
 *  to make sure your connector fragment's controller mapping doesn't conflict with any other connector's controller mapping. And please don't remove /connector_resources/ prefix as it's 
 *  required for securing controller using spring security.
 *  Example: if you artifactId/bundleSymbolic name is org.abc.xyz then rename the mapping to /connector_resources/org_abc_xyz 
 */

@Controller
@RequestMapping("/connector_resources/shapebluereports_fragment")
public class ExampleController extends AbstractAuthenticatedController {

  @RequestMapping(value = {
    "/reports"
  }, method = RequestMethod.GET)
  public String example(ModelMap map, HttpServletRequest request) {
    String tilesDefinitionName = "com.shapeblue.reporting.fragment.example";
    return tilesDefinitionName;
  }
}
