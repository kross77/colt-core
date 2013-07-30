package codeOrchestra.colt.core;

import codeOrchestra.colt.core.launch.LiveLauncher;
import codeOrchestra.colt.core.logging.Logger;
import codeOrchestra.colt.core.model.COLTProject;
import codeOrchestra.colt.core.model.listener.ProjectListener;
import codeOrchestra.colt.core.model.persistence.COLTProjectPersistence;
import codeOrchestra.colt.core.rpc.COLTRemoteService;
import codeOrchestra.colt.core.session.sourcetracking.SourceFileFactory;

/**
 * @author Alexander Eliseyev
 */
public interface LiveCodingLanguageHandler<P extends COLTProject> {

    String getId();

    String getName();

    COLTProjectPersistence<P>[] getAvailablePersistenceHandlers();

    P getCurrentProject();

    void initHandler();

    void disposeHandler();

    void addProjectListener(ProjectListener<P> projectListener);

    void removeProjectListener(ProjectListener<P> projectListener);

    COLTRemoteService getRPCService();

    // Services

    Logger getLogger(String source);

    LiveLauncher<P> getLauncher();

    LiveCodingManager<P> getLiveCodingManager();

    SourceFileFactory getSourceFileFactory();


//    ServiceProvider<P> getServiceProvider();

}
