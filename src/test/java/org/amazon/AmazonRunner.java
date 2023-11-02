package org.amazon;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/amazon.feature",
glue = "org.amazon", monochrome = true , dryRun = false ,
strict = true , snippets = SnippetType.CAMELCASE )
public class AmazonRunner {

}
