.class final Lcom/facebook/orca/l/z;
.super Ljava/lang/Object;
.source "MergingUtil.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function",
        "<",
        "Lcom/facebook/orca/threads/ThreadsCollection;",
        "Ljava/util/Collection",
        "<",
        "Lcom/facebook/orca/threads/ThreadSummary;",
        ">;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 347
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadsCollection;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/ThreadsCollection;",
            ")",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 350
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 347
    check-cast p1, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/l/z;->a(Lcom/facebook/orca/threads/ThreadsCollection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
