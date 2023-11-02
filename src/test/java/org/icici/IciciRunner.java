package org.icici;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/icici.feature",
glue = "org.icici",monochrome = true,strict = true,
dryRun = false, snippets = SnippetType.CAMELCASE,
plugin = {"html:Reports","junit:Reports\\icici.xml","json:Reports\\icici.json"})
public class IciciRunner {

}
