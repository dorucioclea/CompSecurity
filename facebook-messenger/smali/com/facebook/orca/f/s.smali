.class Lcom/facebook/orca/f/s;
.super Lcom/facebook/fbservice/ops/ac;
.source "SendMessageManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/messages/model/threads/Message;

.field final synthetic b:Lcom/facebook/orca/f/r;


# direct methods
.method constructor <init>(Lcom/facebook/orca/f/r;Lcom/facebook/messages/model/threads/Message;)V
    .locals 0

    .prologue
    .line 334
    iput-object p1, p0, Lcom/facebook/orca/f/s;->b:Lcom/facebook/orca/f/r;

    iput-object p2, p0, Lcom/facebook/orca/f/s;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 338
    iget-object v0, p0, Lcom/facebook/orca/f/s;->b:Lcom/facebook/orca/f/r;

    iget-object v1, p0, Lcom/facebook/orca/f/s;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-static {v0, p1, v1}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/orca/f/r;Lcom/facebook/fbservice/service/OperationResult;Lcom/facebook/messages/model/threads/Message;)V

    .line 339
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 343
    iget-object v0, p0, Lcom/facebook/orca/f/s;->b:Lcom/facebook/orca/f/r;

    iget-object v1, p0, Lcom/facebook/orca/f/s;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-static {v0, p1, v1}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/orca/f/r;Lcom/facebook/fbservice/service/ServiceException;Lcom/facebook/messages/model/threads/Message;)V

    .line 344
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 334
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/f/s;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
