package com.learn.design.principle.structural.composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-19 11:13
 * </pre>
 */
@Slf4j
public class CourseCatalog extends CatalogComponent{

    private List<CatalogComponent> catalogComponents = new ArrayList<>();
    private String name;

    public CourseCatalog(String name) {
        this.name = name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        catalogComponents.add(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        catalogComponents.remove(catalogComponent);
    }

    @Override
    public void print() {
        log.info(this.name);
        catalogComponents.forEach(item -> {
            item.print();
        });
    }
}

