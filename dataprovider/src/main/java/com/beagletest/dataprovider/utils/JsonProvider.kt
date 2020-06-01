package com.beagletest.dataprovider.utils

class JsonProvider {

    fun provide(): String = """
        {
           "_componentName_":"vertical",
           "children":[
              {
                 "_componentName_":"text",
                 "text":"Hello world"
              },
              {
                 "_componentName_":"text",
                 "text":"From Server!"
              },
              {
                 "_componentName_":"button",
                 "text":"Continue"
              }
           ]
        }
    """.trimIndent()

    fun provide2(): String = """
    {
        "_componentName_":"vertical",
        "children":[
            {
                "_componentName_":"text",
                "text":"Hello world"
            },
            {
                "_componentName_":"text",
                "text":"From Server!"
            },
            {
                "_componentName_":"button",
                "text":"Continue"
            },
            {
                "_componentName_":"vertical",
                "children":[
                    {
                        "_componentName_":"text",
                        "text":"Another text"
                    }
                ]
            }
        ]
    }
""".trimIndent()

    fun provide3(): String = """
        {
              "_componentName_":"button",
              "text":"Continue"
        }
    """.trimIndent()

    fun provide4(): String = """
        {
           "_componentName_":"vertical",
           "children":[
              {
                 "_componentName_":"image",
                 "url":"https://www.petlove.com.br/images/breeds/193436/profile/original/beagle-p.jpg",
                 "text":"Minha imagem"
              },
              {
                 "_componentName_":"text",
                 "text":"Hello world"
              },
              {
                 "_componentName_":"input",
                 "text":"this is hint",
                 "type":"age"
              },
              {
                 "_componentName_":"text",
                 "text":"From Server!"
              },
              {
                 "_componentName_":"button",
                 "text":"Continue"
              }
           ]
        }
    """.trimIndent()

}
