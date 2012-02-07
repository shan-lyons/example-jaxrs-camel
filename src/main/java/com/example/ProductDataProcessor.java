package com.example;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.example.cxf.model.Model;
import org.apache.camel.example.cxf.model.Trimline;

/**
 * A Processor to convert an array of Trimlines into a collection of Models.
 *
 * @version
 */
public class ProductDataProcessor implements Processor {

    @Override
    public void process(final Exchange exchange) throws Exception {
//        TypeConverter converter = exchange.getContext().getTypeConverter();
//        converter.
        Trimline[] trimlines = exchange.getIn().getBody(Trimline[].class);

        List<Model> models = new ArrayList<Model>();

        models.add(new Model(trimlines));

        exchange.getIn().setBody(models);
    }
}
