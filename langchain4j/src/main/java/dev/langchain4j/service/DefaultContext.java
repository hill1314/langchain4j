package dev.langchain4j.service;

import dev.langchain4j.agent.tool.ToolExecutor;
import dev.langchain4j.agent.tool.ToolSpecification;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.chat.StreamingChatLanguageModel;
import dev.langchain4j.model.moderation.ModerationModel;
import dev.langchain4j.retriever.Retriever;
import dev.langchain4j.service.context.StreamingClassContext;
import dev.langchain4j.service.context.SyncClassContextBase;

import java.util.List;
import java.util.Map;

class DefaultContext implements StreamingClassContext, SyncClassContextBase {

    Class<?> aiServiceClass;

    ChatLanguageModel chatLanguageModel;
    StreamingChatLanguageModel streamingChatLanguageModel;

    ChatMemory chatMemory;

    ModerationModel moderationModel;

    List<ToolSpecification> toolSpecifications;
    Map<String, ToolExecutor> toolExecutors;

    Retriever<TextSegment> retriever;

    @Override
    public ChatMemory getChatMemory() {
        return chatMemory;
    }

    @Override
    public ModerationModel getModerationModel() {
        return moderationModel;
    }

    @Override
    public List<ToolSpecification> getToolSpecifications() {
        return toolSpecifications;
    }

    @Override
    public Map<String, ToolExecutor> getToolExecutors() {
        return toolExecutors;
    }

    @Override
    public Retriever<TextSegment> getRetriever() {
        return retriever;
    }

    @Override
    public StreamingChatLanguageModel getStreamingChatLanguageModel() {
        return streamingChatLanguageModel;
    }

    @Override
    public Class<?> getAiServiceClass() {
        return aiServiceClass;
    }

    @Override
    public ChatLanguageModel getChatLanguageModel() {
        return chatLanguageModel;
    }
}