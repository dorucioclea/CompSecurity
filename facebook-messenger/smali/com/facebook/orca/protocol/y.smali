.class Lcom/facebook/orca/protocol/y;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/d;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/d;)V
    .locals 0

    .prologue
    .line 199
    iput-object p1, p0, Lcom/facebook/orca/protocol/y;->a:Lcom/facebook/orca/protocol/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 199
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/y;-><init>(Lcom/facebook/orca/protocol/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;
    .locals 3

    .prologue
    .line 203
    new-instance v2, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;

    const-class v0, Lcom/facebook/orca/protocol/methods/ad;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/protocol/y;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/protocol/methods/ad;

    const-class v1, Lcom/facebook/orca/protocol/methods/an;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/protocol/y;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/protocol/methods/an;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;-><init>(Lcom/facebook/orca/protocol/methods/ad;Lcom/facebook/orca/protocol/methods/an;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 199
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/y;->a()Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;

    move-result-object v0

    return-object v0
.end method
