package com.example.hellodocker;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class Generator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://43.138.15.180:3306/mine?useUnicode=true&characterEncoding=utf-8&useOldAliasMetadataBehavior=true&serverTimezone=Asia/Shanghai&allowMultiQueries=true", "canal", "CANALcc654321!")
                .globalConfig(builder -> {
                    builder.author("chencheng") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("/Users/chencheng/data/hello-docker/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.hellodocker") // 设置父包名
//                            .moduleName("dao") // 设置父包模块名
                            .entity("model")
                            .mapper("dao")
                            .controller("controller")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "/Users/chencheng/data/hello-docker/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .strategyConfig(builder ->
                        builder
                                // .enableSkipView()
                                .entityBuilder()
                                .enableLombok()
//                                .enableTableFieldAnnotation()
//                                .formatFileName("%sModel")
                                .naming(NamingStrategy.no_change)
                                .mapperBuilder()
                                .enableMapperAnnotation()
                                .serviceBuilder()
                                .formatServiceFileName("%sService")
                                .formatServiceImplFileName("%sServiceImpl")
                                .mapperBuilder()
                                .formatMapperFileName("%sDao")
                                .build())
                .execute();

    }
}
