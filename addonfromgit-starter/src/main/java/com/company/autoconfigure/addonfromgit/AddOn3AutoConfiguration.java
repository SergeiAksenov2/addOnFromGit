package com.company.autoconfigure.addonfromgit;

import com.company.addonfromgit.AddOn3Configuration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import({AddOn3Configuration.class})
public class AddOn3AutoConfiguration {
}

