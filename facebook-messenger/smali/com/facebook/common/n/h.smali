.class Lcom/facebook/common/n/h;
.super Lcom/facebook/inject/d;
.source "NumbersModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/n/b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/n/g;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/facebook/common/n/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/n/b;
    .locals 3

    .prologue
    .line 27
    new-instance v1, Lcom/facebook/common/n/b;

    invoke-virtual {p0}, Lcom/facebook/common/n/h;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/common/n/b;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 23
    invoke-virtual {p0}, Lcom/facebook/common/n/h;->a()Lcom/facebook/common/n/b;

    move-result-object v0

    return-object v0
.end method
