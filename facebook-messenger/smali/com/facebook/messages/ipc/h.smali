.class Lcom/facebook/messages/ipc/h;
.super Lcom/facebook/inject/d;
.source "MessagesIpcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/messages/ipc/c;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/messages/ipc/g;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/messages/ipc/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/messages/ipc/c;
    .locals 3

    .prologue
    .line 34
    new-instance v0, Lcom/facebook/messages/ipc/c;

    const-class v1, Ljava/lang/String;

    const-class v2, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/messages/ipc/h;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/messages/ipc/c;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/facebook/messages/ipc/h;->a()Lcom/facebook/messages/ipc/c;

    move-result-object v0

    return-object v0
.end method
