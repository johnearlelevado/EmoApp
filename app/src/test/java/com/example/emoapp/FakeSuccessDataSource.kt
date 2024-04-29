package com.example.emoapp

import com.example.emoapp.data.DataSource

class FakeSuccessDataSource : DataSource {
        override suspend fun getLevels(): String? {
            return "{\n" +
                    "  \"levels\": [\n" +
                    "    {\n" +
                    "      \"level\": \"1\",\n" +
                    "      \"title\": \"Find your tools\",\n" +
                    "      \"description\": \"Collect your personalised techniques to beat Anxiety\",\n" +
                    "      \"state\": \"AVAILABLE\",\n" +
                    "      \"activities\": [\n" +
                    "        {\n" +
                    "          \"id\": \"2ECefjj9gotSu1RzQYguQV7FBMJel296NaotMcf3PwJ432uh72\",\n" +
                    "          \"challengeId\": \"2ECefjj9gotSu1RzQYguQV\",\n" +
                    "          \"type\": \"PRACTICE\",\n" +
                    "          \"title\": \"Break your worry chain reaction\",\n" +
                    "          \"titleB\": null,\n" +
                    "          \"description\": \"When feeling anxious we tend to worry on repeat. And the more we worry, the more we feel anxious. It’s a vicious cycle. Let’s learn how to break out of it early.\",\n" +
                    "          \"descriptionB\": null,\n" +
                    "          \"state\": \"NOT_SET\",\n" +
                    "          \"icon\": {\n" +
                    "            \"file\": {\n" +
                    "              \"url\": \"//assets.ctfassets.net/37k4ti9zbz4t/DVQrkzmSp53EXqmFn9z1L/f4270b3b29c508c04493ead947e8651f/Chapter_01__Lesson_02__State_Active.pdf\",\n" +
                    "              \"details\": {\n" +
                    "                \"size\": 5998\n" +
                    "              },\n" +
                    "              \"fileName\": \"Chapter_01__Lesson_02__State_Active.pdf\",\n" +
                    "              \"contentType\": \"application/pdf\"\n" +
                    "            },\n" +
                    "            \"title\": \"Chapter=01, Lesson=02, State=Active\",\n" +
                    "            \"description\": \"\"\n" +
                    "          },\n" +
                    "          \"lockedIcon\": {\n" +
                    "            \"file\": {\n" +
                    "              \"url\": \"//assets.ctfassets.net/37k4ti9zbz4t/1aknm1E9St7J2mIKPeerI8/e937194308275460c2facda7d09cf9e7/Chapter_01__Lesson_02__State_Locked.pdf\",\n" +
                    "              \"details\": {\n" +
                    "                \"size\": 5998\n" +
                    "              },\n" +
                    "              \"fileName\": \"Chapter_01__Lesson_02__State_Locked.pdf\",\n" +
                    "              \"contentType\": \"application/pdf\"\n" +
                    "            },\n" +
                    "            \"title\": \"Chapter=01, Lesson=02, State=Locked\",\n" +
                    "            \"description\": \"\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"id\": \"71c46gzRB5mCgBYvNEwFYo7FBMJel296NaotMcf3PwJ432uh72\",\n" +
                    "          \"challengeId\": \"71c46gzRB5mCgBYvNEwFYo\",\n" +
                    "          \"type\": \"PRACTICE\",\n" +
                    "          \"title\": \"Find techniques to overcome anxiety\",\n" +
                    "          \"titleB\": null,\n" +
                    "          \"description\": \"Taking back your mind from anxiety can be a challenge. But don’t worry, we've got the perfect techniques to help. Let’s find out which techniques work best for you!\",\n" +
                    "          \"descriptionB\": null,\n" +
                    "          \"state\": \"NOT_SET\",\n" +
                    "          \"icon\": {\n" +
                    "            \"file\": {\n" +
                    "              \"url\": \"//assets.ctfassets.net/37k4ti9zbz4t/7qfuLW6KOLr5wARa6y1iiJ/d9fe08d9680ebe8fa1d02b056e9d9f61/Chapter_05__Lesson_02__State_Active.pdf\",\n" +
                    "              \"details\": {\n" +
                    "                \"size\": 9671\n" +
                    "              },\n" +
                    "              \"fileName\": \"Chapter_05__Lesson_02__State_Active.pdf\",\n" +
                    "              \"contentType\": \"application/pdf\"\n" +
                    "            },\n" +
                    "            \"title\": \"Chapter 05 Lesson 02 State Active\",\n" +
                    "            \"description\": \"\"\n" +
                    "          },\n" +
                    "          \"lockedIcon\": {\n" +
                    "            \"file\": {\n" +
                    "              \"url\": \"//assets.ctfassets.net/37k4ti9zbz4t/60XAuyMCfdyX8vz3uMwPTW/97811784b538551493416bdc6b279f85/Chapter_05__Lesson_02__State_Locked.pdf\",\n" +
                    "              \"details\": {\n" +
                    "                \"size\": 9671\n" +
                    "              },\n" +
                    "              \"fileName\": \"Chapter_05__Lesson_02__State_Locked.pdf\",\n" +
                    "              \"contentType\": \"application/pdf\"\n" +
                    "            },\n" +
                    "            \"title\": \"Chapter 05 Lesson 02 State Locked\",\n" +
                    "            \"description\": \"\"\n" +
                    "          }\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    }]}"
        }

    }