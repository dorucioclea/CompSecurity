.class Lcom/facebook/config/server/n;
.super Lcom/facebook/inject/d;
.source "ServerConfigModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/http/c/i;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/config/server/l;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/facebook/config/server/n;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/http/c/i;
    .locals 1

    .prologue
    .line 40
    const-class v0, Lcom/facebook/config/server/j;

    invoke-virtual {p0, v0}, Lcom/facebook/config/server/n;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/server/j;

    invoke-interface {v0}, Lcom/facebook/config/server/j;->a()Lcom/facebook/http/c/i;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0}, Lcom/facebook/config/server/n;->a()Lcom/facebook/http/c/i;

    move-result-object v0

    return-object v0
.end method
